package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SUNWIND device specifications for Android Compose previews.
 *
 * This extension provides SUNWIND device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SUNWIND.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SUNWIND: Any
  get() = object {
      /** SUNWIND SS1259PG */
      val SS1259PG = "spec:width=800,height=1280,unit=px,dpi=160"

      /** SUNWIND SS1260PG */
      val SS1260PG = "spec:width=800,height=1280,unit=px,dpi=160"

      /** SUNWIND SS1270PL */
      val SS1270PL = "spec:width=800,height=1280,unit=px,dpi=213"

      /** SUNWIND SS7238PG */
      val SS7238PG = "spec:width=600,height=1024,unit=px,dpi=160"

      /** SUNWIND SS7265PG */
      val SS7265PG = "spec:width=600,height=1024,unit=px,dpi=160"

      /** SUNWIND SS8263PG */
      val SS8263PG = "spec:width=800,height=1280,unit=px,dpi=213"

      /** SUNWIND SS9236PG */
      val SS9236PG = "spec:width=800,height=1280,unit=px,dpi=160"

      /** SUNWIND SS9237MG */
      val SS9237MG = "spec:width=800,height=1280,unit=px,dpi=213"

      /** SUNWIND ST7230MG */
      val ST7230MG = "spec:width=600,height=1024,unit=px,dpi=160"

  }
