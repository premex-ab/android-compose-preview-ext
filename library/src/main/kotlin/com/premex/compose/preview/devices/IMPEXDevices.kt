package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * IMPEX device specifications for Android Compose previews.
 *
 * This extension provides IMPEX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IMPEX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IMPEX: Any
  get() = object {
      /** IMPEX OD0M_EA_T32 */
      val OD0M_EA_T32 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** IMPEX takao */
      val TAKAO = "spec:width=720,height=1280,unit=px,dpi=213"

  }
