package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * JOYSURF device specifications for Android Compose previews.
 *
 * This extension provides JOYSURF device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Joysurf.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Joysurf: Any
  get() = object {
      /** JOYSURF TB-JS100A */
      val TB_JS100A = "spec:width=800,height=1280,unit=px,dpi=160"

      /** JOYSURF TB-JS101A */
      val TB_JS101A = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
