package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MagentaTV device specifications for Android Compose previews.
 *
 * This extension provides MagentaTV device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Magentatv.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Magentatv: Any
  get() = object {
      /** MagentaTV DV6067Y */
      val DV6067Y = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** MagentaTV HY44G */
      val HY44G = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** MagentaTV IMTM840A */
      val IMTM840A = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** MagentaTV SEI804DT */
      val SEI804DT = "spec:width=720,height=1280,unit=px,dpi=320"

  }
