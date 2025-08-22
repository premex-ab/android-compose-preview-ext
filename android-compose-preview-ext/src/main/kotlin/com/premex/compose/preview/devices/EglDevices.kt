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
 * @Preview(device = Devices.Egl.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Egl: Any
  get() = object {
      /** EGL EGL11QF6 */
      val EGL11QF6 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** EGL EGL1529I */
      val EGL1529I = "spec:width=800,height=1280,unit=px,dpi=160"

      /** EGL EGL15QF6 */
      val EGL15QF6 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** EGL EGLMW1528I */
      val EGLMW1528I = "spec:width=600,height=1024,unit=px,dpi=160"

  }
