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
 * @Preview(device = Devices.IPRO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IPRO: Any
  get() = object {
      /** DeviceSpec(manufacturer=IPRO, code=Amber5s_Plus, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IPRO, code=Amber5s_Plus, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val AMBER5S_PLUS = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=IPRO, code=Amber5S_Pro, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IPRO, code=Amber5S_Pro, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val AMBER5S_PRO = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=IPRO, code=Amber7S, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IPRO, code=Amber7S, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val AMBER7S = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=IPRO, code=Amber8, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IPRO, code=Amber8, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val AMBER8 = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=IPRO, code=Amber8S, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IPRO, code=Amber8S, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val AMBER8S = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=IPRO, code=Amber8s_Mate, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IPRO, code=Amber8s_Mate, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val AMBER8S_MATE = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=IPRO, code=Amber8S_plus, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IPRO, code=Amber8S_plus, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val AMBER8S_PLUS = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=IPRO, code=Amber8s_Pro, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IPRO, code=Amber8s_Pro, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val AMBER8S_PRO = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=IPRO, code=Benny, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IPRO, code=Benny, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val BENNY = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=IPRO, code=Benny10, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IPRO, code=Benny10, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val BENNY10 = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=IPRO, code=BennyM, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IPRO, code=BennyM, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val BENNYM = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=IPRO, code=BEQUE7S, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IPRO, code=BEQUE7S, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val BEQUE7S = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=IPRO, code=IPRO_X1, width=480, height=996, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IPRO, code=IPRO_X1, width=480,
      height=996, dpi=240, isGoogleDevice=false).code */
      val IPRO_X1 = "spec:width=480,height=996,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=IPRO, code=Jade8S, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IPRO, code=Jade8S, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val JADE8S = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=IPRO, code=Kylin_5_0S, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IPRO, code=Kylin_5_0S, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val KYLIN_5_0S = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=IPRO, code=MEGA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IPRO, code=MEGA, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val MEGA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=IPRO, code=Mobilephone, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IPRO, code=Mobilephone, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val MOBILEPHONE = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=IPRO, code=Opal4S, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IPRO, code=Opal4S, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val OPAL4S = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=IPRO, code=Ruby5S, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IPRO, code=Ruby5S, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val RUBY5S = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=IPRO, code=S100, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IPRO, code=S100, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val S100 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=IPRO, code=S100E, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IPRO, code=S100E, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val S100E = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=IPRO, code=S200M, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IPRO, code=S200M, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val S200M = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=IPRO, code=S300, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IPRO, code=S300, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val S300 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=IPRO, code=S401, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IPRO, code=S401, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val S401 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=IPRO, code=S401A, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IPRO, code=S401A, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val S401A = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=IPRO, code=S501, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IPRO, code=S501, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val S501 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=IPRO, code=S501A, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IPRO, code=S501A, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val S501A = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=IPRO, code=S501APlus, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IPRO, code=S501APlus, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val S501APLUS = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=IPRO, code=S501Pro, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IPRO, code=S501Pro, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val S501PRO = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=IPRO, code=SAMBA65S, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IPRO, code=SAMBA65S, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val SAMBA65S = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=IPRO, code=Soda6S, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IPRO, code=Soda6S, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val SODA6S = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=IPRO, code=Y100, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IPRO, code=Y100, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val Y100 = "spec:width=480,height=960,unit=px,dpi=240"

  }
