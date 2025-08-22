package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * EVERTEK device specifications for Android Compose previews.
 *
 * This extension provides EVERTEK device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.EVERTEK.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.EVERTEK: Any
  get() = object {
      /** EVERTEK E7224HG */
      val E7224HG = "spec:width=600,height=1024,unit=px,dpi=160"

      /** EVERTEK E8224HG */
      val E8224HG = "spec:width=800,height=1280,unit=px,dpi=213"

      /** EVERTEK EVERTEK_M10_Max */
      val EVERTEK_M10_MAX = "spec:width=600,height=1280,unit=px,dpi=280"

      /** EVERTEK EVERTEK_M20S_Mini */
      val EVERTEK_M20S_MINI = "spec:width=480,height=854,unit=px,dpi=240"

      /** EVERTEK M20_Pro */
      val M20_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** EVERTEK P17 */
      val P17 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** EVERTEK P17_Pro */
      val P17_PRO = "spec:width=600,height=1024,unit=px,dpi=160"

      /** EVERTEK P18_Pro */
      val P18_PRO = "spec:width=800,height=1280,unit=px,dpi=240"

      /** EVERTEK V4 */
      val V4 = "spec:width=480,height=854,unit=px,dpi=240"

      /** EVERTEK V4_Nano */
      val V4_NANO = "spec:width=480,height=800,unit=px,dpi=240"

      /** EVERTEK V5_Plus */
      val V5_PLUS = "spec:width=480,height=960,unit=px,dpi=240"

      /** EVERTEK V8 */
      val V8 = "spec:width=480,height=960,unit=px,dpi=240"

      /** EVERTEK V9_Plus */
      val V9_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

  }
