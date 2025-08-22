package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * WOWI device specifications for Android Compose previews.
 *
 * This extension provides WOWI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.WOWI.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.WOWI: Any
  get() = object {
      /** DeviceSpec(manufacturer=WOWI, code=S8e, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WOWI, code=S8e, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val S8E = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=WOWI, code=SQ753, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WOWI, code=SQ753, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val SQ753 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WOWI, code=SQ788, width=480, height=854, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WOWI, code=SQ788, width=480,
      height=854, dpi=213, isGoogleDevice=false).code */
      val SQ788 = "spec:width=480,height=854,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=WOWI, code=SQ788_1, width=480, height=854, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WOWI, code=SQ788_1, width=480,
      height=854, dpi=213, isGoogleDevice=false).code */
      val SQ788_1 = "spec:width=480,height=854,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=WOWI, code=Tab_X5, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WOWI, code=Tab_X5, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB_X5 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
