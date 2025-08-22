package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Kogan device specifications for Android Compose previews.
 *
 * This extension provides Kogan device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Kogan.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Kogan: Any
  get() = object {
      /** Kogan Agora_Go */
      val AGORA_GO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Kogan AGORA_XI */
      val AGORA_XI = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Kogan cottongreen */
      val COTTONGREEN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Kogan hanyang */
      val HANYANG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Kogan ikebukuro */
      val IKEBUKURO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Kogan KAKT10164SA */
      val KAKT10164SA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Kogan KATB10128WPA */
      val KATB10128WPA = "spec:width=1200,height=1920,unit=px,dpi=213"

      /** Kogan KATB1064CGRY */
      val KATB1064CGRY = "spec:width=800,height=1280,unit=px,dpi=240"

      /** Kogan KATB1064WGRY */
      val KATB1064WGRY = "spec:width=1200,height=1920,unit=px,dpi=213"

      /** Kogan KATB21064CPA */
      val KATB21064CPA = "spec:width=800,height=1280,unit=px,dpi=240"

      /** Kogan KATB2P1064WPA */
      val KATB2P1064WPA = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** Kogan Kogan_Agora_9 */
      val KOGAN_AGORA_9 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Kogan Kogan_Agora_XS */
      val KOGAN_AGORA_XS = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Kogan longshan */
      val LONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Kogan marina */
      val MARINA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Kogan nagata */
      val NAGATA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Kogan nippori */
      val NIPPORI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Kogan redwood */
      val REDWOOD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Kogan samseong */
      val SAMSEONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Kogan shibuya */
      val SHIBUYA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Kogan tamachi */
      val TAMACHI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Kogan yeongdeungpo */
      val YEONGDEUNGPO = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
