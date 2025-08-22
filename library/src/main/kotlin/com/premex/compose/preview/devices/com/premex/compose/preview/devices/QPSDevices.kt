package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * QPS device specifications for Android Compose previews.
 *
 * This extension provides QPS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.QPS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.QPS: Any
  get() = object {
      /** DeviceSpec(manufacturer=QPS, code=ASIUR_101, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QPS, code=ASIUR_101, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val ASIUR_101 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=QPS, code=KID15, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QPS, code=KID15, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val KID15 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=QPS, code=KIDS01, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QPS, code=KIDS01, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val KIDS01 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=QPS, code=P50, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QPS, code=P50, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val P50 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=QPS, code=T1, width=1200, height=1920, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QPS, code=T1, width=1200,
      height=1920, dpi=213, isGoogleDevice=false).code */
      val T1 = "spec:width=1200,height=1920,unit=px,dpi=213"

  }
