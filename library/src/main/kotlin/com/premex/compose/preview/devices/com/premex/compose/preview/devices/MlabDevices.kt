package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Mlab device specifications for Android Compose previews.
 *
 * This extension provides Mlab device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mlab.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mlab: Any
  get() = object {
      /** DeviceSpec(manufacturer=Mlab, code=MB4_3G_PLUS_SE, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mlab, code=MB4_3G_PLUS_SE,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val MB4_3G_PLUS_SE = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Mlab, code=MB8715, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mlab, code=MB8715, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val MB8715 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Mlab, code=MB8717, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mlab, code=MB8717, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val MB8717 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Mlab, code=MLAB_GLOWY7, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mlab, code=MLAB_GLOWY7, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val MLAB_GLOWY7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Mlab, code=MLAB_GLOWY8, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mlab, code=MLAB_GLOWY8, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val MLAB_GLOWY8 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Mlab, code=MLAB_KIDS_PLUS, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mlab, code=MLAB_KIDS_PLUS,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val MLAB_KIDS_PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Mlab, code=Studio_Phone_10, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mlab, code=Studio_Phone_10,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val STUDIO_PHONE_10 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
