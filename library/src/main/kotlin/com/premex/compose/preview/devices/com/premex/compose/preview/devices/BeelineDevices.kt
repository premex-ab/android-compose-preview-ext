package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Beeline device specifications for Android Compose previews.
 *
 * This extension provides Beeline device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Beeline.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Beeline: Any
  get() = object {
      /** DeviceSpec(manufacturer=Beeline, code=Beeline_Pro_6, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Beeline, code=Beeline_Pro_6,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val BEELINE_PRO_6 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Beeline, code=SWG2001A, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Beeline, code=SWG2001A, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SWG2001A = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Beeline, code=z701, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Beeline, code=z701, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val Z701 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
