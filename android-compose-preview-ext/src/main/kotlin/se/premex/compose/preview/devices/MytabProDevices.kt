package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * MyTab_pro device specifications for Android Compose previews.
 *
 * This extension provides MyTab_pro device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MytabPro.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MytabPro: Any
  get() = object {
      /** MyTab_pro MyTab_Pro_13 */
      val MYTAB_PRO_13 = "spec:width=800,height=1280,unit=px,dpi=200"

  }
