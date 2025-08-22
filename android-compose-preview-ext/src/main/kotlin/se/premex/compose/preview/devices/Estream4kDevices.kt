package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * eSTREAM4K device specifications for Android Compose previews.
 *
 * This extension provides eSTREAM4K device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Estream4k.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Estream4k: Any
  get() = object {
      /** eSTREAM4K kunlun */
      val KUNLUN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** eSTREAM4K SEI400TV */
      val SEI400TV = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** eSTREAM4K SEI500ABB */
      val SEI500ABB = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** eSTREAM4K SEI500AS */
      val SEI500AS = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** eSTREAM4K SEI500BR */
      val SEI500BR = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** eSTREAM4K SEI500BS */
      val SEI500BS = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** eSTREAM4K SEI500CB */
      val SEI500CB = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** eSTREAM4K SEI500L */
      val SEI500L = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** eSTREAM4K SEI500MC */
      val SEI500MC = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** eSTREAM4K SEI500MN */
      val SEI500MN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** eSTREAM4K SEI500RCN */
      val SEI500RCN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** eSTREAM4K SEI500SECV */
      val SEI500SECV = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** eSTREAM4K SEI500TDS */
      val SEI500TDS = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** eSTREAM4K SEI500TV */
      val SEI500TV = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
