package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * iQOO device specifications for Android Compose previews.
 *
 * This extension provides iQOO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IQOO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IQOO: Any
  get() = object {
      /** DeviceSpec(manufacturer=iQOO, code=I1928, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iQOO, code=I1928, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val I1928 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=iQOO, code=I2126, width=1080, height=2404, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iQOO, code=I2126, width=1080,
      height=2404, dpi=440, isGoogleDevice=false).code */
      val I2126 = "spec:width=1080,height=2404,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=iQOO, code=I2127, width=1080, height=2408, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iQOO, code=I2127, width=1080,
      height=2408, dpi=440, isGoogleDevice=false).code */
      val I2127 = "spec:width=1080,height=2408,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=iQOO, code=I2201, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iQOO, code=I2201, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val I2201 = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=iQOO, code=I2202, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iQOO, code=I2202, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val I2202 = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=iQOO, code=I2203, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iQOO, code=I2203, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val I2203 = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=iQOO, code=I2207, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iQOO, code=I2207, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val I2207 = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=iQOO, code=I2208, width=1080, height=2408, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iQOO, code=I2208, width=1080,
      height=2408, dpi=440, isGoogleDevice=false).code */
      val I2208 = "spec:width=1080,height=2408,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=iQOO, code=I2212, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iQOO, code=I2212, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val I2212 = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=iQOO, code=I2213, width=1080, height=2388, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iQOO, code=I2213, width=1080,
      height=2388, dpi=440, isGoogleDevice=false).code */
      val I2213 = "spec:width=1080,height=2388,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=iQOO, code=I2214, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iQOO, code=I2214, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val I2214 = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=iQOO, code=I2216, width=1080, height=2388, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iQOO, code=I2216, width=1080,
      height=2388, dpi=440, isGoogleDevice=false).code */
      val I2216 = "spec:width=1080,height=2388,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=iQOO, code=I2217, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iQOO, code=I2217, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val I2217 = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=iQOO, code=I2218, width=1260, height=2800, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iQOO, code=I2218, width=1260,
      height=2800, dpi=420, isGoogleDevice=false).code */
      val I2218 = "spec:width=1260,height=2800,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=iQOO, code=I2219, width=1080, height=2408, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iQOO, code=I2219, width=1080,
      height=2408, dpi=440, isGoogleDevice=false).code */
      val I2219 = "spec:width=1080,height=2408,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=iQOO, code=I2220, width=1260, height=2800, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iQOO, code=I2220, width=1260,
      height=2800, dpi=480, isGoogleDevice=false).code */
      val I2220 = "spec:width=1260,height=2800,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=iQOO, code=I2221, width=1260, height=2800, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iQOO, code=I2221, width=1260,
      height=2800, dpi=480, isGoogleDevice=false).code */
      val I2221 = "spec:width=1260,height=2800,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=iQOO, code=I2223, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iQOO, code=I2223, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val I2223 = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=iQOO, code=I2301, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iQOO, code=I2301, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val I2301 = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=iQOO, code=I2302, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iQOO, code=I2302, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val I2302 = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=iQOO, code=I2304, width=1260, height=2800, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iQOO, code=I2304, width=1260,
      height=2800, dpi=480, isGoogleDevice=false).code */
      val I2304 = "spec:width=1260,height=2800,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=iQOO, code=I2305, width=1080, height=2392, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iQOO, code=I2305, width=1080,
      height=2392, dpi=440, isGoogleDevice=false).code */
      val I2305 = "spec:width=1080,height=2392,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=iQOO, code=I2306, width=720, height=1612, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iQOO, code=I2306, width=720,
      height=1612, dpi=300, isGoogleDevice=false).code */
      val I2306 = "spec:width=720,height=1612,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=iQOO, code=I2401, width=1440, height=3168, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iQOO, code=I2401, width=1440,
      height=3168, dpi=440, isGoogleDevice=false).code */
      val I2401 = "spec:width=1440,height=3168,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=iQOO, code=I2403, width=1080, height=2392, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iQOO, code=I2403, width=1080,
      height=2392, dpi=440, isGoogleDevice=false).code */
      val I2403 = "spec:width=1080,height=2392,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=iQOO, code=I2404, width=1080, height=2408, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iQOO, code=I2404, width=1080,
      height=2408, dpi=440, isGoogleDevice=false).code */
      val I2404 = "spec:width=1080,height=2408,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=iQOO, code=I2405, width=1260, height=2800, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iQOO, code=I2405, width=1260,
      height=2800, dpi=480, isGoogleDevice=false).code */
      val I2405 = "spec:width=1260,height=2800,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=iQOO, code=I2407, width=1080, height=2392, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iQOO, code=I2407, width=1080,
      height=2392, dpi=440, isGoogleDevice=false).code */
      val I2407 = "spec:width=1080,height=2392,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=iQOO, code=I2409, width=720, height=1600, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iQOO, code=I2409, width=720,
      height=1600, dpi=300, isGoogleDevice=false).code */
      val I2409 = "spec:width=720,height=1600,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=iQOO, code=I2410, width=1080, height=2392, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iQOO, code=I2410, width=1080,
      height=2392, dpi=440, isGoogleDevice=false).code */
      val I2410 = "spec:width=1080,height=2392,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=iQOO, code=2009, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iQOO, code=2009, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val _2009 = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=iQOO, code=2011, width=1080, height=2408, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iQOO, code=2011, width=1080,
      height=2408, dpi=440, isGoogleDevice=false).code */
      val _2011 = "spec:width=1080,height=2408,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=iQOO, code=2012, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iQOO, code=2012, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val _2012 = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=iQOO, code=2017, width=1080, height=2376, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iQOO, code=2017, width=1080,
      height=2376, dpi=440, isGoogleDevice=false).code */
      val _2017 = "spec:width=1080,height=2376,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=iQOO, code=2018, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iQOO, code=2018, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val _2018 = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=iQOO, code=2019, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iQOO, code=2019, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val _2019 = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=iQOO, code=2022, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iQOO, code=2022, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val _2022 = "spec:width=1080,height=2400,unit=px,dpi=440"

  }
