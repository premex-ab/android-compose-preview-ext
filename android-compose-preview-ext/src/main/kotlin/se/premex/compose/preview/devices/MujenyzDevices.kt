package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * MUJENYZ device specifications for Android Compose previews.
 *
 * This extension provides MUJENYZ device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mujenyz.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mujenyz: Any
  get() = object {
      /** MUJENYZ A9 */
      val A9 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
