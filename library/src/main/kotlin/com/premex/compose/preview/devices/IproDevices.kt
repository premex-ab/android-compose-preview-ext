package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * IPRO device specifications for Android Compose previews.
 *
 * This extension provides IPRO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ipro.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ipro: Any
  get() = object {
      /** IPRO Amber5s_Plus */
      val AMBER5S_PLUS = "spec:width=480,height=960,unit=px,dpi=213"

      /** IPRO Amber5S_Pro */
      val AMBER5S_PRO = "spec:width=480,height=960,unit=px,dpi=213"

      /** IPRO Amber7S */
      val AMBER7S = "spec:width=480,height=960,unit=px,dpi=240"

      /** IPRO Amber8 */
      val AMBER8 = "spec:width=480,height=960,unit=px,dpi=213"

      /** IPRO Amber8S */
      val AMBER8S = "spec:width=480,height=960,unit=px,dpi=213"

      /** IPRO Amber8s_Mate */
      val AMBER8S_MATE = "spec:width=480,height=960,unit=px,dpi=213"

      /** IPRO Amber8S_plus */
      val AMBER8S_PLUS = "spec:width=480,height=960,unit=px,dpi=213"

      /** IPRO Amber8s_Pro */
      val AMBER8S_PRO = "spec:width=480,height=960,unit=px,dpi=213"

      /** IPRO Benny */
      val BENNY = "spec:width=480,height=960,unit=px,dpi=240"

      /** IPRO Benny10 */
      val BENNY10 = "spec:width=480,height=960,unit=px,dpi=213"

      /** IPRO BennyM */
      val BENNYM = "spec:width=480,height=960,unit=px,dpi=213"

      /** IPRO BEQUE7S */
      val BEQUE7S = "spec:width=600,height=1024,unit=px,dpi=160"

      /** IPRO IPRO_X1 */
      val IPRO_X1 = "spec:width=480,height=996,unit=px,dpi=240"

      /** IPRO Jade8S */
      val JADE8S = "spec:width=480,height=960,unit=px,dpi=240"

      /** IPRO Kylin_5_0S */
      val KYLIN_5_0S = "spec:width=480,height=854,unit=px,dpi=240"

      /** IPRO MEGA */
      val MEGA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** IPRO Mobilephone */
      val MOBILEPHONE = "spec:width=480,height=960,unit=px,dpi=200"

      /** IPRO Opal4S */
      val OPAL4S = "spec:width=480,height=800,unit=px,dpi=240"

      /** IPRO Ruby5S */
      val RUBY5S = "spec:width=480,height=960,unit=px,dpi=240"

      /** IPRO S100 */
      val S100 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** IPRO S100E */
      val S100E = "spec:width=720,height=1600,unit=px,dpi=320"

      /** IPRO S200M */
      val S200M = "spec:width=720,height=1600,unit=px,dpi=320"

      /** IPRO S300 */
      val S300 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** IPRO S401 */
      val S401 = "spec:width=480,height=800,unit=px,dpi=240"

      /** IPRO S401A */
      val S401A = "spec:width=480,height=800,unit=px,dpi=240"

      /** IPRO S501 */
      val S501 = "spec:width=480,height=854,unit=px,dpi=240"

      /** IPRO S501A */
      val S501A = "spec:width=480,height=854,unit=px,dpi=240"

      /** IPRO S501APlus */
      val S501APLUS = "spec:width=480,height=854,unit=px,dpi=240"

      /** IPRO S501Pro */
      val S501PRO = "spec:width=480,height=854,unit=px,dpi=240"

      /** IPRO SAMBA65S */
      val SAMBA65S = "spec:width=720,height=1600,unit=px,dpi=320"

      /** IPRO Soda6S */
      val SODA6S = "spec:width=720,height=1560,unit=px,dpi=320"

      /** IPRO Y100 */
      val Y100 = "spec:width=480,height=960,unit=px,dpi=240"

  }
