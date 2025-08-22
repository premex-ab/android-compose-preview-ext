package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ENTITY device specifications for Android Compose previews.
 *
 * This extension provides ENTITY device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ENTITY.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ENTITY: Any
  get() = object {
      /** DeviceSpec(manufacturer=ENTITY, code=ENT11QF12, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ENTITY, code=ENT11QF12, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val ENT11QF12 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ENTITY, code=ENT15QF220, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ENTITY, code=ENT15QF220, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val ENT15QF220 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ENTITY, code=ENT75QF620, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ENTITY, code=ENT75QF620, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val ENT75QF620 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ENTITY, code=EntityG12Pro, width=1600, height=2560, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ENTITY, code=EntityG12Pro,
      width=1600, height=2560, dpi=240, isGoogleDevice=false).code */
      val ENTITYG12PRO = "spec:width=1600,height=2560,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ENTITY, code=ENTITY_G102IN1HARDKB, width=800, height=1280,
      dpi=160, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ENTITY,
      code=ENTITY_G102IN1HARDKB, width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val ENTITY_G102IN1HARDKB = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ENTITY, code=G10XM, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ENTITY, code=G10XM, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val G10XM = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ENTITY, code=G10_2IN1_GEN2, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ENTITY, code=G10_2IN1_GEN2,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val G10_2IN1_GEN2 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
