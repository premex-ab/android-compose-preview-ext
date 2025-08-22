package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * OneLern device specifications for Android Compose previews.
 *
 * This extension provides OneLern device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.OneLern.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.OneLern: Any
  get() = object {
      /** DeviceSpec(manufacturer=OneLern, code=OneLernDB009, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OneLern, code=OneLernDB009,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val ONELERNDB009 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=OneLern, code=OneLernDB010, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OneLern, code=OneLernDB010,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val ONELERNDB010 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
