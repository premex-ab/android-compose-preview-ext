package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * X_View device specifications for Android Compose previews.
 *
 * This extension provides X_View device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.XView.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.XView: Any
  get() = object {
      /** DeviceSpec(manufacturer=X_View, code=Protab10, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=X_View, code=Protab10, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val PROTAB10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=X_View, code=Proton_Neon, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=X_View, code=Proton_Neon,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val PROTON_NEON = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=X_View, code=Q11, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=X_View, code=Q11, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val Q11 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=X_View, code=X_View_Q7, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=X_View, code=X_View_Q7, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val X_VIEW_Q7 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
