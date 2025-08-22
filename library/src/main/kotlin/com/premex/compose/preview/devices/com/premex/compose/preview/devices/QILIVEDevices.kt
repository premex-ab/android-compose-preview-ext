package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * QILIVE device specifications for Android Compose previews.
 *
 * This extension provides QILIVE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.QILIVE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.QILIVE: Any
  get() = object {
      /** DeviceSpec(manufacturer=QILIVE, code=Q4T10IN, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QILIVE, code=Q4T10IN, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val Q4T10IN = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=QILIVE, code=Q6T10IN, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QILIVE, code=Q6T10IN, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val Q6T10IN = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=QILIVE, code=Q7T10INP, width=1200, height=1920, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QILIVE, code=Q7T10INP, width=1200,
      height=1920, dpi=213, isGoogleDevice=false).code */
      val Q7T10INP = "spec:width=1200,height=1920,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=QILIVE, code=QT19071, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QILIVE, code=QT19071, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val QT19071 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=QILIVE, code=QT19101, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QILIVE, code=QT19101, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val QT19101 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=QILIVE, code=QT2108BP, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QILIVE, code=QT2108BP, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val QT2108BP = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=QILIVE, code=QT22101B, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QILIVE, code=QT22101B, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val QT22101B = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=QILIVE, code=QT22103BP, width=800, height=1332, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QILIVE, code=QT22103BP, width=800,
      height=1332, dpi=200, isGoogleDevice=false).code */
      val QT22103BP = "spec:width=800,height=1332,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=QILIVE, code=QT2308BK, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QILIVE, code=QT2308BK, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val QT2308BK = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=QILIVE, code=QT23109BP, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QILIVE, code=QT23109BP, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val QT23109BP = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=QILIVE, code=QT24101B, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QILIVE, code=QT24101B, width=800,
      height=1280, dpi=200, isGoogleDevice=false).code */
      val QT24101B = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=QILIVE, code=QT24105BP, width=1200, height=1920, dpi=210,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QILIVE, code=QT24105BP, width=1200,
      height=1920, dpi=210, isGoogleDevice=false).code */
      val QT24105BP = "spec:width=1200,height=1920,unit=px,dpi=210"

  }
