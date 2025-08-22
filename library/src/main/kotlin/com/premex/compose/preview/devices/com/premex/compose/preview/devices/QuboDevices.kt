package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Qubo device specifications for Android Compose previews.
 *
 * This extension provides Qubo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Qubo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Qubo: Any
  get() = object {
      /** DeviceSpec(manufacturer=Qubo, code=BIG1, width=480, height=1014, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Qubo, code=BIG1, width=480,
      height=1014, dpi=213, isGoogleDevice=false).code */
      val BIG1 = "spec:width=480,height=1014,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Qubo, code=P19, width=640, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Qubo, code=P19, width=640,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P19 = "spec:width=640,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Qubo, code=SP510, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Qubo, code=SP510, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val SP510 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Qubo, code=T104_64GB, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Qubo, code=T104_64GB, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val T104_64GB = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Qubo, code=T10_32GB, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Qubo, code=T10_32GB, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val T10_32GB = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Qubo, code=T3G_Q07, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Qubo, code=T3G_Q07, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val T3G_Q07 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Qubo, code=TKIDS_100_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Qubo, code=TKIDS_100_EEA,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val TKIDS_100_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Qubo, code=X626, width=480, height=1014, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Qubo, code=X626, width=480,
      height=1014, dpi=213, isGoogleDevice=false).code */
      val X626 = "spec:width=480,height=1014,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Qubo, code=X626_4G, width=480, height=1014, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Qubo, code=X626_4G, width=480,
      height=1014, dpi=213, isGoogleDevice=false).code */
      val X626_4G = "spec:width=480,height=1014,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Qubo, code=X668_32GB, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Qubo, code=X668_32GB, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val X668_32GB = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Qubo, code=X668_64GB, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Qubo, code=X668_64GB, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val X668_64GB = "spec:width=720,height=1600,unit=px,dpi=320"

  }
