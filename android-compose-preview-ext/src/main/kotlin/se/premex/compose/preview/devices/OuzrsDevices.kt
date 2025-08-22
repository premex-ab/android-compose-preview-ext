package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * OUZRS device specifications for Android Compose previews.
 *
 * This extension provides OUZRS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ouzrs.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ouzrs: Any
  get() = object {
      /** OUZRS OUZRSM4 */
      val OUZRSM4 = "spec:width=768,height=1366,unit=px,dpi=160"

  }
