package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * RHINO device specifications for Android Compose previews.
 *
 * This extension provides RHINO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.RHINO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.RHINO: Any
  get() = object {
      /** RHINO novax */
      val NOVAX = "spec:width=720,height=1560,unit=px,dpi=320"

      /** RHINO scoutx */
      val SCOUTX = "spec:width=800,height=1280,unit=px,dpi=213"

      /** RHINO stratos */
      val STRATOS = "spec:width=1200,height=1920,unit=px,dpi=260"

  }
