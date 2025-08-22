package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * SANNUO device specifications for Android Compose previews.
 *
 * This extension provides SANNUO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Sannuo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Sannuo: Any
  get() = object {
      /** SANNUO K102 */
      val K102 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** SANNUO K108 */
      val K108 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
