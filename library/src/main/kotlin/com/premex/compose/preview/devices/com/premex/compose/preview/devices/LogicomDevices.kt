package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * logicom device specifications for Android Compose previews.
 *
 * This extension provides logicom device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Logicom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Logicom: Any
  get() = object {
      /** DeviceSpec(manufacturer=logicom, code=La_tab_link_74, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=logicom, code=La_tab_link_74,
      width=600, height=1024, dpi=213, isGoogleDevice=false).code */
      val LA_TAB_LINK_74 = "spec:width=600,height=1024,unit=px,dpi=213"

  }
