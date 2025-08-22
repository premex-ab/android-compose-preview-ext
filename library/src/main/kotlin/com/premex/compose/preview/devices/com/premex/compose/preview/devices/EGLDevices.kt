package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * EGL device specifications for Android Compose previews.
 *
 * This extension provides EGL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.EGL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.EGL: Any
  get() = object {
      /** DeviceSpec(manufacturer=EGL, code=EGL11QF6, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EGL, code=EGL11QF6, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val EGL11QF6 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=EGL, code=EGL1529I, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EGL, code=EGL1529I, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val EGL1529I = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=EGL, code=EGL15QF6, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EGL, code=EGL15QF6, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val EGL15QF6 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=EGL, code=EGLMW1528I, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EGL, code=EGLMW1528I, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val EGLMW1528I = "spec:width=600,height=1024,unit=px,dpi=160"

  }
