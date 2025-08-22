package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * X-VIEW device specifications for Android Compose previews.
 *
 * This extension provides X-VIEW device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.XVIEW.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.XVIEW: Any
  get() = object {
      /** DeviceSpec(manufacturer=X-VIEW, code=Proton_Amber_HD, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=X-VIEW, code=Proton_Amber_HD,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val PROTON_AMBER_HD = "spec:width=600,height=1024,unit=px,dpi=160"

  }
