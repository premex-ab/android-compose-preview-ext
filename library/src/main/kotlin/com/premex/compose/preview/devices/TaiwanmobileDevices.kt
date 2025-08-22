package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TaiwanMobile device specifications for Android Compose previews.
 *
 * This extension provides TaiwanMobile device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Taiwanmobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Taiwanmobile: Any
  get() = object {
      /** TaiwanMobile Amazing_A32 */
      val AMAZING_A32 = "spec:width=480,height=854,unit=px,dpi=240"

      /** TaiwanMobile Amazing_A35 */
      val AMAZING_A35 = "spec:width=480,height=854,unit=px,dpi=240"

      /** TaiwanMobile Amazing_A55 */
      val AMAZING_A55 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** TaiwanMobile Amazing_A57 */
      val AMAZING_A57 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
