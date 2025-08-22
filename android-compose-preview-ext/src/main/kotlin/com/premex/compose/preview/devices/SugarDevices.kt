package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SUGAR device specifications for Android Compose previews.
 *
 * This extension provides SUGAR device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Sugar.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Sugar: Any
  get() = object {
      /** SUGAR i9071ae */
      val I9071AE = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** SUGAR p101bs */
      val P101BS = "spec:width=1080,height=2220,unit=px,dpi=440"

      /** SUGAR p201as */
      val P201AS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** SUGAR p210cn */
      val P210CN = "spec:width=720,height=1512,unit=px,dpi=320"

      /** SUGAR p312cs_tw */
      val P312CS_TW = "spec:width=720,height=1520,unit=px,dpi=280"

      /** SUGAR p611bn */
      val P611BN = "spec:width=1080,height=2340,unit=px,dpi=420"

      /** SUGAR p700as */
      val P700AS = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** SUGAR s9121 */
      val S9121 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** SUGAR SUGAR_C12 */
      val SUGAR_C12 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** SUGAR SUGAR_C60 */
      val SUGAR_C60 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** SUGAR SUGAR_P1 */
      val SUGAR_P1 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** SUGAR SUGAR_P11 */
      val SUGAR_P11 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** SUGAR SUGAR_S50 */
      val SUGAR_S50 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** SUGAR SUGAR_S55 */
      val SUGAR_S55 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** SUGAR SUGAR_Y12s */
      val SUGAR_Y12S = "spec:width=480,height=960,unit=px,dpi=240"

      /** SUGAR SUGAR_Y13s */
      val SUGAR_Y13S = "spec:width=480,height=960,unit=px,dpi=240"

      /** SUGAR SUGAR_Y16 */
      val SUGAR_Y16 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** SUGAR SUGAR_Y18 */
      val SUGAR_Y18 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** SUGAR v12bns */
      val V12BNS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** SUGAR v730_64 */
      val V730_64 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** SUGAR v830_64 */
      val V830_64 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** SUGAR x600as */
      val X600AS = "spec:width=1080,height=2246,unit=px,dpi=480"

      /** SUGAR x600as_hk */
      val X600AS_HK = "spec:width=1080,height=2246,unit=px,dpi=480"

      /** SUGAR x800as */
      val X800AS = "spec:width=1080,height=2160,unit=px,dpi=480"

  }
