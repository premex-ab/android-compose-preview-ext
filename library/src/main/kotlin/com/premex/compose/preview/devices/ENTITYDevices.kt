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
      /** ENTITY ENT11QF12 */
      val ENT11QF12 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** ENTITY ENT15QF220 */
      val ENT15QF220 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** ENTITY ENT75QF620 */
      val ENT75QF620 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** ENTITY EntityG12Pro */
      val ENTITYG12PRO = "spec:width=1600,height=2560,unit=px,dpi=240"

      /** ENTITY ENTITY_G102IN1HARDKB */
      val ENTITY_G102IN1HARDKB = "spec:width=800,height=1280,unit=px,dpi=160"

      /** ENTITY G10XM */
      val G10XM = "spec:width=800,height=1280,unit=px,dpi=160"

      /** ENTITY G10_2IN1_GEN2 */
      val G10_2IN1_GEN2 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
