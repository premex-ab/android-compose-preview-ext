package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TOSCIDO device specifications for Android Compose previews.
 *
 * This extension provides TOSCIDO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TOSCIDO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TOSCIDO: Any
  get() = object {
      /** DeviceSpec(manufacturer=TOSCIDO, code=P101, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TOSCIDO, code=P101, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val P101 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TOSCIDO, code=P101-EEA, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TOSCIDO, code=P101-EEA, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val P101_EEA = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TOSCIDO, code=T12-EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TOSCIDO, code=T12-EEA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val T12_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=TOSCIDO, code=T13-EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TOSCIDO, code=T13-EEA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val T13_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=TOSCIDO, code=T15, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TOSCIDO, code=T15, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val T15 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TOSCIDO, code=T151, width=1200, height=1920, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TOSCIDO, code=T151, width=1200,
      height=1920, dpi=213, isGoogleDevice=false).code */
      val T151 = "spec:width=1200,height=1920,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=TOSCIDO, code=T151-EEA, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TOSCIDO, code=T151-EEA, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val T151_EEA = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TOSCIDO, code=T181, width=1200, height=1920, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TOSCIDO, code=T181, width=1200,
      height=1920, dpi=200, isGoogleDevice=false).code */
      val T181 = "spec:width=1200,height=1920,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=TOSCIDO, code=T181-EEA, width=1200, height=1920, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TOSCIDO, code=T181-EEA, width=1200,
      height=1920, dpi=200, isGoogleDevice=false).code */
      val T181_EEA = "spec:width=1200,height=1920,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=TOSCIDO, code=T201, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TOSCIDO, code=T201, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val T201 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=TOSCIDO, code=T201-EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TOSCIDO, code=T201-EEA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val T201_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=TOSCIDO, code=T20-EEA, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TOSCIDO, code=T20-EEA, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val T20_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TOSCIDO, code=T211-EEA, width=1200, height=1920, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TOSCIDO, code=T211-EEA, width=1200,
      height=1920, dpi=213, isGoogleDevice=false).code */
      val T211_EEA = "spec:width=1200,height=1920,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=TOSCIDO, code=T21-EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TOSCIDO, code=T21-EEA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val T21_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=TOSCIDO, code=T22, width=800, height=1280, dpi=186,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TOSCIDO, code=T22, width=800,
      height=1280, dpi=186, isGoogleDevice=false).code */
      val T22 = "spec:width=800,height=1280,unit=px,dpi=186"

      /** DeviceSpec(manufacturer=TOSCIDO, code=T221, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TOSCIDO, code=T221, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val T221 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TOSCIDO, code=T22-EEA, width=800, height=1280, dpi=186,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TOSCIDO, code=T22-EEA, width=800,
      height=1280, dpi=186, isGoogleDevice=false).code */
      val T22_EEA = "spec:width=800,height=1280,unit=px,dpi=186"

      /** DeviceSpec(manufacturer=TOSCIDO, code=T26-EEA, width=1600, height=2176, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TOSCIDO, code=T26-EEA, width=1600,
      height=2176, dpi=240, isGoogleDevice=false).code */
      val T26_EEA = "spec:width=1600,height=2176,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TOSCIDO, code=T28, width=800, height=1280, dpi=212,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TOSCIDO, code=T28, width=800,
      height=1280, dpi=212, isGoogleDevice=false).code */
      val T28 = "spec:width=800,height=1280,unit=px,dpi=212"

      /** DeviceSpec(manufacturer=TOSCIDO, code=T28-EEA, width=800, height=1280, dpi=212,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TOSCIDO, code=T28-EEA, width=800,
      height=1280, dpi=212, isGoogleDevice=false).code */
      val T28_EEA = "spec:width=800,height=1280,unit=px,dpi=212"

      /** DeviceSpec(manufacturer=TOSCIDO, code=T32-EEA, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TOSCIDO, code=T32-EEA, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val T32_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=TOSCIDO, code=T50, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TOSCIDO, code=T50, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val T50 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=TOSCIDO, code=T50-EEA, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TOSCIDO, code=T50-EEA, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val T50_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TOSCIDO, code=X102, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TOSCIDO, code=X102, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val X102 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
