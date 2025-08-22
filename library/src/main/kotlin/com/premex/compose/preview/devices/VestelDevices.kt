package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Vestel device specifications for Android Compose previews.
 *
 * This extension provides Vestel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Vestel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Vestel: Any
  get() = object {
      /** Vestel Ada */
      val ADA = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Vestel AdaGo */
      val ADAGO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Vestel Arya */
      val ARYA = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Vestel ATLAS */
      val ATLAS = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Vestel Cunda */
      val CUNDA = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** Vestel DynoLight */
      val DYNOLIGHT = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Vestel EKVATOR */
      val EKVATOR = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Vestel Leo */
      val LEO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Vestel Leo_2GB */
      val LEO_2GB = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Vestel Lodos */
      val LODOS = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Vestel MB300 */
      val MB300 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Vestel Orsa */
      val ORSA = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Vestel Pardus */
      val PARDUS = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Vestel Pars */
      val PARS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Vestel Poyraz */
      val POYRAZ = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** Vestel Reys */
      val REYS = "spec:width=1080,height=1920,unit=px,dpi=420"

      /** Vestel Riga */
      val RIGA = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Vestel Samos */
      val SAMOS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Vestel shandao */
      val SHANDAO = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Vestel Teos */
      val TEOS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Vestel Troia */
      val TROIA = "spec:width=1080,height=2246,unit=px,dpi=480"

      /** Vestel Truva */
      val TRUVA = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Vestel V4 */
      val V4 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Vestel Venus_V3_5040 */
      val VENUS_V3_5040 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Vestel Venus_V3_5045 */
      val VENUS_V3_5045 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Vestel Venus_V3_5070 */
      val VENUS_V3_5070 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Vestel Venus_V3_5570 */
      val VENUS_V3_5570 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Vestel VTab7010 */
      val VTAB7010 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Vestel yeoksam */
      val YEOKSAM = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
