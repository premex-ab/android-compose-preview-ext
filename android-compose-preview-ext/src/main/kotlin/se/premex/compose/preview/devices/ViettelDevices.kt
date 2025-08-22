package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Viettel device specifications for Android Compose previews.
 *
 * This extension provides Viettel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Viettel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Viettel: Any
  get() = object {
      /** Viettel MediaBox_B866V2 */
      val MEDIABOX_B866V2 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Viettel VTTV-SD4K-20 */
      val VTTV_SD4K_20 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
