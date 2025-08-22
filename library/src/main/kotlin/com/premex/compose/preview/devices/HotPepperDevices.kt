package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HotPepper device specifications for Android Compose previews.
 *
 * This extension provides HotPepper device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HotPepper.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HotPepper: Any
  get() = object {
      /** HotPepper DT10_EEA */
      val DT10_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** HotPepper HPPAP16 */
      val HPPAP16 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** HotPepper HPPL60A */
      val HPPL60A = "spec:width=720,height=1600,unit=px,dpi=280"

      /** HotPepper HPPL63A */
      val HPPL63A = "spec:width=480,height=960,unit=px,dpi=213"

      /** HotPepper HPP-GS1 */
      val HPP_GS1 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** HotPepper HPP-L55B */
      val HPP_L55B = "spec:width=480,height=960,unit=px,dpi=240"

      /** HotPepper K82A */
      val K82A = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** HotPepper KR10 */
      val KR10 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** HotPepper KT10 */
      val KT10 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** HotPepper Stylo_7plus */
      val STYLO_7PLUS = "spec:width=720,height=1600,unit=px,dpi=320"

      /** HotPepper VLE5 */
      val VLE5 = "spec:width=480,height=854,unit=px,dpi=240"

      /** HotPepper 15_Pro_Max */
      val _15_PRO_MAX = "spec:width=720,height=1650,unit=px,dpi=320"

  }
