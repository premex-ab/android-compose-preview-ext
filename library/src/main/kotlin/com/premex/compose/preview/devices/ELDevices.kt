package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * EL device specifications for Android Compose previews.
 *
 * This extension provides EL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.EL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.EL: Any
  get() = object {
      /** EL D60_Pro */
      val D60_PRO = "spec:width=600,height=1280,unit=px,dpi=315"

      /** EL D68 */
      val D68 = "spec:width=720,height=1560,unit=px,dpi=380"

      /** EL Pad-S11 */
      val PAD_S11 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** EL Pad_S7 */
      val PAD_S7 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** EL Pad_S8 */
      val PAD_S8 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** EL X60_PRO */
      val X60_PRO = "spec:width=720,height=1600,unit=px,dpi=280"

      /** EL X70 */
      val X70 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** EL X80 */
      val X80 = "spec:width=720,height=1640,unit=px,dpi=280"

      /** EL Y10 */
      val Y10 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** EL 6AT */
      val _6AT = "spec:width=480,height=960,unit=px,dpi=240"

      /** EL 6CS */
      val _6CS = "spec:width=240,height=296,unit=px,dpi=120"

  }
