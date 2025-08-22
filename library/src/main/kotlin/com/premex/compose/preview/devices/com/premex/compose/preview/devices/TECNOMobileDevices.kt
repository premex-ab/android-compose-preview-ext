package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TECNO-Mobile device specifications for Android Compose previews.
 *
 * This extension provides TECNO-Mobile device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TECNOMobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TECNOMobile: Any
  get() = object {
      /** DeviceSpec(manufacturer=TECNO-Mobile, code=TECNO-Mobile-BF7n, width=720, height=1612,
      dpi=320, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO-Mobile,
      code=TECNO-Mobile-BF7n, width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val TECNO_MOBILE_BF7N = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO-Mobile, code=TECNO-Mobile-BG6, width=720, height=1612,
      dpi=320, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO-Mobile,
      code=TECNO-Mobile-BG6, width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val TECNO_MOBILE_BG6 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO-Mobile, code=TECNO-Mobile-BG7n, width=720, height=1612,
      dpi=320, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO-Mobile,
      code=TECNO-Mobile-BG7n, width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val TECNO_MOBILE_BG7N = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO-Mobile, code=TECNO-Mobile-CH6i, width=1080, height=2460,
      dpi=480, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO-Mobile,
      code=TECNO-Mobile-CH6i, width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val TECNO_MOBILE_CH6I = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO-Mobile, code=TECNO-Mobile-CH6n, width=1080, height=2460,
      dpi=480, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO-Mobile,
      code=TECNO-Mobile-CH6n, width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val TECNO_MOBILE_CH6N = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO-Mobile, code=TECNO-Mobile-CI6n, width=1080, height=2460,
      dpi=480, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO-Mobile,
      code=TECNO-Mobile-CI6n, width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val TECNO_MOBILE_CI6N = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO-Mobile, code=TECNO-Mobile-KG5k, width=720, height=1612,
      dpi=320, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO-Mobile,
      code=TECNO-Mobile-KG5k, width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val TECNO_MOBILE_KG5K = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO-Mobile, code=TECNO-Mobile-KG6k, width=720, height=1612,
      dpi=320, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO-Mobile,
      code=TECNO-Mobile-KG6k, width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val TECNO_MOBILE_KG6K = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO-Mobile, code=TECNO-Mobile-KG6p, width=1080, height=2408,
      dpi=480, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO-Mobile,
      code=TECNO-Mobile-KG6p, width=1080, height=2408, dpi=480, isGoogleDevice=false).code */
      val TECNO_MOBILE_KG6P = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO-Mobile, code=TECNO-Mobile-KG8, width=1080, height=2460,
      dpi=480, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO-Mobile,
      code=TECNO-Mobile-KG8, width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val TECNO_MOBILE_KG8 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO-Mobile, code=TECNO-Mobile-KI5q, width=720, height=1612,
      dpi=320, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO-Mobile,
      code=TECNO-Mobile-KI5q, width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val TECNO_MOBILE_KI5Q = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO-Mobile, code=TECNO-Mobile-KJ5n, width=1080, height=2248,
      dpi=480, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO-Mobile,
      code=TECNO-Mobile-KJ5n, width=1080, height=2248, dpi=480, isGoogleDevice=false).code */
      val TECNO_MOBILE_KJ5N = "spec:width=1080,height=2248,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO-Mobile, code=TECNO-Mobile-KJ6, width=1080, height=2460,
      dpi=480, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO-Mobile,
      code=TECNO-Mobile-KJ6, width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val TECNO_MOBILE_KJ6 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO-Mobile, code=TECNO-Mobile-KJ7, width=1080, height=2436,
      dpi=480, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO-Mobile,
      code=TECNO-Mobile-KJ7, width=1080, height=2436, dpi=480, isGoogleDevice=false).code */
      val TECNO_MOBILE_KJ7 = "spec:width=1080,height=2436,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO-Mobile, code=TECNO-Mobile-KL5n, width=720, height=1600,
      dpi=320, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO-Mobile,
      code=TECNO-Mobile-KL5n, width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val TECNO_MOBILE_KL5N = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO-Mobile, code=TECNO-Mobile-LG6n, width=720, height=1640,
      dpi=320, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO-Mobile,
      code=TECNO-Mobile-LG6n, width=720, height=1640, dpi=320, isGoogleDevice=false).code */
      val TECNO_MOBILE_LG6N = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO-Mobile, code=TECNO-Mobile-LH8n, width=1080, height=2460,
      dpi=480, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO-Mobile,
      code=TECNO-Mobile-LH8n, width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val TECNO_MOBILE_LH8N = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO-Mobile, code=TECNO-Mobile-LI6, width=1080, height=2460,
      dpi=480, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO-Mobile,
      code=TECNO-Mobile-LI6, width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val TECNO_MOBILE_LI6 = "spec:width=1080,height=2460,unit=px,dpi=480"

  }
