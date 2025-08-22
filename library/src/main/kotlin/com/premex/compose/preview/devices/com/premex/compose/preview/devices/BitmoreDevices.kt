package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Bitmore device specifications for Android Compose previews.
 *
 * This extension provides Bitmore device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Bitmore.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Bitmore: Any
  get() = object {
      /** DeviceSpec(manufacturer=Bitmore, code=Mobitab10_S3_32GB, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bitmore, code=Mobitab10_S3_32GB,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val MOBITAB10_S3_32GB = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Bitmore, code=Tab10_Plus_32GB, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bitmore, code=Tab10_Plus_32GB,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val TAB10_PLUS_32GB = "spec:width=800,height=1280,unit=px,dpi=160"

  }
