package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KONROW device specifications for Android Compose previews.
 *
 * This extension provides KONROW device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.KONROW.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KONROW: Any
  get() = object {
      /** KONROW CITY */
      val CITY = "spec:width=480,height=800,unit=px,dpi=240"

      /** KONROW CITY4 */
      val CITY4 = "spec:width=480,height=800,unit=px,dpi=240"

      /** KONROW CITY5 */
      val CITY5 = "spec:width=480,height=854,unit=px,dpi=240"

      /** KONROW EASY5 */
      val EASY5 = "spec:width=480,height=854,unit=px,dpi=240"

      /** KONROW EASY62 */
      val EASY62 = "spec:width=480,height=996,unit=px,dpi=240"

      /** KONROW EASY_5 */
      val EASY_5 = "spec:width=480,height=854,unit=px,dpi=213"

      /** KONROW EASY_K55 */
      val EASY_K55 = "spec:width=480,height=960,unit=px,dpi=213"

      /** KONROW EASY_S55P */
      val EASY_S55P = "spec:width=720,height=1440,unit=px,dpi=320"

      /** KONROW EASY_S55P_2021 */
      val EASY_S55P_2021 = "spec:width=480,height=960,unit=px,dpi=213"

      /** KONROW KONROW_SKY_LITE */
      val KONROW_SKY_LITE = "spec:width=720,height=1440,unit=px,dpi=320"

      /** KONROW KONROW_SKY_PLUS */
      val KONROW_SKY_PLUS = "spec:width=720,height=1500,unit=px,dpi=320"

      /** KONROW KTAB704 */
      val KTAB704 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** KONROW K-TAB1005 */
      val K_TAB1005 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** KONROW K-TAB703 */
      val K_TAB703 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** KONROW K-TAB801 */
      val K_TAB801 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** KONROW MUST */
      val MUST = "spec:width=720,height=1512,unit=px,dpi=320"

      /** KONROW NEOW */
      val NEOW = "spec:width=480,height=960,unit=px,dpi=200"

      /** KONROW SKY55 */
      val SKY55 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** KONROW SKY63 */
      val SKY63 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** KONROW SKY_55 */
      val SKY_55 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** KONROW SOFT5 */
      val SOFT5 = "spec:width=480,height=854,unit=px,dpi=240"

      /** KONROW SOFT5P */
      val SOFT5P = "spec:width=480,height=854,unit=px,dpi=240"

      /** KONROW SWEET5 */
      val SWEET5 = "spec:width=480,height=854,unit=px,dpi=240"

  }
