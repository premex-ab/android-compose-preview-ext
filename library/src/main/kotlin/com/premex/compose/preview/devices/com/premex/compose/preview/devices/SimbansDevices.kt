package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Simbans device specifications for Android Compose previews.
 *
 * This extension provides Simbans device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Simbans.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Simbans: Any
  get() = object {
      /** DeviceSpec(manufacturer=Simbans, code=PicassoTab, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Simbans, code=PicassoTab,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val PICASSOTAB = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Simbans, code=PicassoTab8s, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Simbans, code=PicassoTab8s,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val PICASSOTAB8S = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Simbans, code=PICASSOTABX14, width=1080, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Simbans, code=PICASSOTABX14,
      width=1080, height=1920, dpi=240, isGoogleDevice=false).code */
      val PICASSOTABX14 = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Simbans, code=PicassoTab_9, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Simbans, code=PicassoTab_9,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val PICASSOTAB_9 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Simbans, code=PicassoTab_X, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Simbans, code=PicassoTab_X,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val PICASSOTAB_X = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Simbans, code=PicassoTab_XL, width=768, height=1368, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Simbans, code=PicassoTab_XL,
      width=768, height=1368, dpi=160, isGoogleDevice=false).code */
      val PICASSOTAB_XL = "spec:width=768,height=1368,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Simbans, code=TangoTab, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Simbans, code=TangoTab, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TANGOTAB = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Simbans, code=TangoTab8, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Simbans, code=TangoTab8, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TANGOTAB8 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Simbans, code=TangoTab_364, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Simbans, code=TangoTab_364,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val TANGOTAB_364 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Simbans, code=TangoTab_X, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Simbans, code=TangoTab_X,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val TANGOTAB_X = "spec:width=800,height=1280,unit=px,dpi=160"

  }
