package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BLACK_FOX device specifications for Android Compose previews.
 *
 * This extension provides BLACK_FOX device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BlackFox.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BlackFox: Any
  get() = object {
      /** BLACK_FOX BMM431B */
      val BMM431B = "spec:width=720,height=1600,unit=px,dpi=300"

      /** BLACK_FOX BMM431S */
      val BMM431S = "spec:width=720,height=1440,unit=px,dpi=300"

      /** BLACK_FOX BMM441A */
      val BMM441A = "spec:width=720,height=1520,unit=px,dpi=300"

      /** BLACK_FOX BMM441S */
      val BMM441S = "spec:width=720,height=1520,unit=px,dpi=320"

      /** BLACK_FOX BMM531D */
      val BMM531D = "spec:width=480,height=960,unit=px,dpi=240"

      /** BLACK_FOX BMM531S */
      val BMM531S = "spec:width=720,height=1440,unit=px,dpi=300"

      /** BLACK_FOX BMM532D */
      val BMM532D = "spec:width=720,height=1440,unit=px,dpi=300"

      /** BLACK_FOX BMM541W */
      val BMM541W = "spec:width=720,height=1440,unit=px,dpi=320"

      /** BLACK_FOX BMM543S */
      val BMM543S = "spec:width=480,height=960,unit=px,dpi=240"

  }
