package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Tablet_PC device specifications for Android Compose previews.
 *
 * This extension provides Tablet_PC device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TabletPc.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TabletPc: Any
  get() = object {
      /** Tablet_PC T3G_07 */
      val T3G_07 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** Tablet_PC T3G_10B */
      val T3G_10B = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Tablet_PC Tablet_PC */
      val TABLET_PC = "spec:width=800,height=1280,unit=px,dpi=213"

  }
