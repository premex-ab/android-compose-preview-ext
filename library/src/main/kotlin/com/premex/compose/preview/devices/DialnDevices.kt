package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Dialn device specifications for Android Compose previews.
 *
 * This extension provides Dialn device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Dialn.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Dialn: Any
  get() = object {
      /** Dialn Neo */
      val NEO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Dialn NeoA */
      val NEOA = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Dialn Nova */
      val NOVA = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Dialn NovaA */
      val NOVAA = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Dialn X62 */
      val X62 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Dialn X62A */
      val X62A = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Dialn X62B */
      val X62B = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Dialn X62C */
      val X62C = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Dialn X65A */
      val X65A = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Dialn X65B */
      val X65B = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Dialn X65C */
      val X65C = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Dialn X68B */
      val X68B = "spec:width=720,height=1600,unit=px,dpi=320"

  }
