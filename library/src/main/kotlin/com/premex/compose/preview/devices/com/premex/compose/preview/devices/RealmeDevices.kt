package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Realme device specifications for Android Compose previews.
 *
 * This extension provides Realme device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Realme.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Realme: Any
  get() = object {
      /** DeviceSpec(manufacturer=Realme, code=gangbyeon, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Realme, code=gangbyeon, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val GANGBYEON = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Realme, code=ikebukuro, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Realme, code=ikebukuro, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val IKEBUKURO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Realme, code=RMX1821, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Realme, code=RMX1821, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val RMX1821 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Realme, code=RMX1822, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Realme, code=RMX1822, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val RMX1822 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Realme, code=RMX1825, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Realme, code=RMX1825, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val RMX1825 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Realme, code=RMX1827, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Realme, code=RMX1827, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val RMX1827 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Realme, code=RMX1831, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Realme, code=RMX1831, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val RMX1831 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Realme, code=RMX1833, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Realme, code=RMX1833, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val RMX1833 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Realme, code=RMX1851, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Realme, code=RMX1851, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val RMX1851 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Realme, code=RMX1851CN, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Realme, code=RMX1851CN, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val RMX1851CN = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Realme, code=RMX1853, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Realme, code=RMX1853, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val RMX1853 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Realme, code=RMX1901CN, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Realme, code=RMX1901CN, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val RMX1901CN = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Realme, code=RMX1941, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Realme, code=RMX1941, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val RMX1941 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Realme, code=RMX1942, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Realme, code=RMX1942, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val RMX1942 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Realme, code=RMX1943, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Realme, code=RMX1943, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val RMX1943 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Realme, code=RMX1945, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Realme, code=RMX1945, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val RMX1945 = "spec:width=720,height=1560,unit=px,dpi=320"

  }
