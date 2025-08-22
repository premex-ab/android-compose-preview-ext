package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Nomi device specifications for Android Compose previews.
 *
 * This extension provides Nomi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Nomi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Nomi: Any
  get() = object {
      /** DeviceSpec(manufacturer=Nomi, code=i5012, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Nomi, code=i5012, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val I5012 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Nomi, code=i5013, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Nomi, code=i5013, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val I5013 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Nomi, code=i5014, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Nomi, code=i5014, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val I5014 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Nomi, code=i5050, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Nomi, code=i5050, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val I5050 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Nomi, code=i6030, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Nomi, code=i6030, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val I6030 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Nomi, code=Nomi_C070011, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Nomi, code=Nomi_C070011, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val NOMI_C070011 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Nomi, code=Nomi_C070012, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Nomi, code=Nomi_C070012, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val NOMI_C070012 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Nomi, code=Nomi_C070014, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Nomi, code=Nomi_C070014, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val NOMI_C070014 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Nomi, code=Nomi_C070014L, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Nomi, code=Nomi_C070014L,
      width=800, height=1280, dpi=240, isGoogleDevice=false).code */
      val NOMI_C070014L = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Nomi, code=Nomi_C070034, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Nomi, code=Nomi_C070034, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val NOMI_C070034 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Nomi, code=Nomi_C070044, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Nomi, code=Nomi_C070044, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val NOMI_C070044 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Nomi, code=Nomi_C080014, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Nomi, code=Nomi_C080014, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val NOMI_C080014 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Nomi, code=Nomi_C080034, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Nomi, code=Nomi_C080034, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val NOMI_C080034 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Nomi, code=Nomi_C101010_Ultra2, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Nomi, code=Nomi_C101010_Ultra2,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val NOMI_C101010_ULTRA2 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Nomi, code=Nomi_C101012, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Nomi, code=Nomi_C101012, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val NOMI_C101012 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Nomi, code=Nomi_C101014, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Nomi, code=Nomi_C101014, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val NOMI_C101014 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Nomi, code=Nomi_C101030, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Nomi, code=Nomi_C101030, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val NOMI_C101030 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Nomi, code=Nomi_C101034, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Nomi, code=Nomi_C101034, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val NOMI_C101034 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Nomi, code=Nomi_C101040, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Nomi, code=Nomi_C101040, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val NOMI_C101040 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Nomi, code=Nomi_C101044, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Nomi, code=Nomi_C101044, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val NOMI_C101044 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Nomi, code=Nomi_i5001, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Nomi, code=Nomi_i5001, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val NOMI_I5001 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Nomi, code=Nomi_i5510, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Nomi, code=Nomi_i5510, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val NOMI_I5510 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
