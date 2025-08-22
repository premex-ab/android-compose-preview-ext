package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SkyDevices device specifications for Android Compose previews.
 *
 * This extension provides SkyDevices device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SkyDevices.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SkyDevices: Any
  get() = object {
      /** SkyDevices Elite_6Pro */
      val ELITE_6PRO = "spec:width=480,height=960,unit=px,dpi=213"

      /** SkyDevices Elite_D65 */
      val ELITE_D65 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** SkyDevices Elite_P5 */
      val ELITE_P5 = "spec:width=480,height=854,unit=px,dpi=213"

      /** SkyDevices Elite_P55 */
      val ELITE_P55 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** SkyDevices Elite_P55BMaxB */
      val ELITE_P55BMAXB = "spec:width=480,height=960,unit=px,dpi=213"

      /** SkyDevices ELITE_P55LIFE */
      val ELITE_P55LIFE = "spec:width=480,height=960,unit=px,dpi=213"

      /** SkyDevices Elite_P55MANAL */
      val ELITE_P55MANAL = "spec:width=480,height=960,unit=px,dpi=213"

      /** SkyDevices ELITE_P55Max */
      val ELITE_P55MAX = "spec:width=480,height=960,unit=px,dpi=240"

      /** SkyDevices Elite_P55MAXA */
      val ELITE_P55MAXA = "spec:width=480,height=960,unit=px,dpi=213"

      /** SkyDevices Elite_P55MUSAN */
      val ELITE_P55MUSAN = "spec:width=480,height=960,unit=px,dpi=213"

      /** SkyDevices Elite_P55MxUS */
      val ELITE_P55MXUS = "spec:width=480,height=960,unit=px,dpi=213"

      /** SkyDevices ELITE_P55US */
      val ELITE_P55US = "spec:width=480,height=960,unit=px,dpi=213"

      /** SkyDevices Elite_P55_CMax */
      val ELITE_P55_CMAX = "spec:width=480,height=960,unit=px,dpi=213"

      /** SkyDevices Elite_P55_Max_D */
      val ELITE_P55_MAX_D = "spec:width=480,height=960,unit=px,dpi=213"

      /** SkyDevices Elite_V55 */
      val ELITE_V55 = "spec:width=480,height=960,unit=px,dpi=240"

      /** SkyDevices Platinum_H5_PLUS */
      val PLATINUM_H5_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** SkyDevices Platinum_J5 */
      val PLATINUM_J5 = "spec:width=480,height=854,unit=px,dpi=200"

      /** SkyDevices Platinum_J5US */
      val PLATINUM_J5US = "spec:width=480,height=854,unit=px,dpi=200"

      /** SkyDevices SKY_B63 */
      val SKY_B63 = "spec:width=720,height=1520,unit=px,dpi=280"

      /** SkyDevices SKY_B632NUS */
      val SKY_B632NUS = "spec:width=720,height=1520,unit=px,dpi=280"

      /** SkyDevices SKY_B63CUW */
      val SKY_B63CUW = "spec:width=720,height=1520,unit=px,dpi=280"

      /** SkyDevices SKY_B63HA */
      val SKY_B63HA = "spec:width=720,height=1520,unit=px,dpi=280"

      /** SkyDevices SKY_B63NAL */
      val SKY_B63NAL = "spec:width=720,height=1520,unit=px,dpi=280"

      /** SkyDevices SKY_B63NUSA */
      val SKY_B63NUSA = "spec:width=720,height=1520,unit=px,dpi=280"

      /** SkyDevices SKY_D63 */
      val SKY_D63 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** SkyDevices SKY_PAD10MXUSNA */
      val SKY_PAD10MXUSNA = "spec:width=800,height=1280,unit=px,dpi=200"

  }
