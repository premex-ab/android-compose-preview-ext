package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KEMPLER_STRAUSS device specifications for Android Compose previews.
 *
 * This extension provides KEMPLER_STRAUSS device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.KEMPLERSTRAUSS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KEMPLERSTRAUSS: Any
  get() = object {
      /** DeviceSpec(manufacturer=KEMPLER_STRAUSS, code=KEMPLER_9, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KEMPLER_STRAUSS, code=KEMPLER_9,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val KEMPLER_9 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KEMPLER_STRAUSS, code=KEMPLER_P1, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KEMPLER_STRAUSS, code=KEMPLER_P1,
      width=720, height=1520, dpi=320, isGoogleDevice=false).code */
      val KEMPLER_P1 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KEMPLER_STRAUSS, code=KEMPLER_P1_AMATEUR_PLUS, width=480,
      height=854, dpi=240, isGoogleDevice=false).manufacturer
      DeviceSpec(manufacturer=KEMPLER_STRAUSS, code=KEMPLER_P1_AMATEUR_PLUS, width=480, height=854,
      dpi=240, isGoogleDevice=false).code */
      val KEMPLER_P1_AMATEUR_PLUS = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KEMPLER_STRAUSS, code=KEMPLER_P3, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KEMPLER_STRAUSS, code=KEMPLER_P3,
      width=720, height=1560, dpi=320, isGoogleDevice=false).code */
      val KEMPLER_P3 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KEMPLER_STRAUSS, code=KEMPLER_X, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KEMPLER_STRAUSS, code=KEMPLER_X,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val KEMPLER_X = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KEMPLER_STRAUSS, code=P1pro, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KEMPLER_STRAUSS, code=P1pro,
      width=720, height=1520, dpi=320, isGoogleDevice=false).code */
      val P1PRO = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KEMPLER_STRAUSS, code=P1_Amateur, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KEMPLER_STRAUSS, code=P1_Amateur,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val P1_AMATEUR = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KEMPLER_STRAUSS, code=ZKEMPLER, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KEMPLER_STRAUSS, code=ZKEMPLER,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val ZKEMPLER = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=KEMPLER_STRAUSS, code=ZKEMPLER11, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KEMPLER_STRAUSS, code=ZKEMPLER11,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val ZKEMPLER11 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=KEMPLER_STRAUSS, code=ZKEMPLER11PRO, width=800, height=1280,
      dpi=213, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KEMPLER_STRAUSS,
      code=ZKEMPLER11PRO, width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val ZKEMPLER11PRO = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=KEMPLER_STRAUSS, code=ZKEMPLER_11PRO, width=800, height=1280,
      dpi=160, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KEMPLER_STRAUSS,
      code=ZKEMPLER_11PRO, width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val ZKEMPLER_11PRO = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=KEMPLER_STRAUSS, code=ZKEMPLER_MAX, width=600, height=1024,
      dpi=160, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KEMPLER_STRAUSS,
      code=ZKEMPLER_MAX, width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val ZKEMPLER_MAX = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=KEMPLER_STRAUSS, code=ZKEMPLER_PLUS, width=600, height=1024,
      dpi=160, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KEMPLER_STRAUSS,
      code=ZKEMPLER_PLUS, width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val ZKEMPLER_PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=KEMPLER_STRAUSS, code=ZKEMPLER_PRO, width=600, height=1024,
      dpi=160, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KEMPLER_STRAUSS,
      code=ZKEMPLER_PRO, width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val ZKEMPLER_PRO = "spec:width=600,height=1024,unit=px,dpi=160"

  }
