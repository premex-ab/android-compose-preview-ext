package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * zte device specifications for Android Compose previews.
 *
 * This extension provides zte device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Zte.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Zte: Any
  get() = object {
      /** zte achill */
      val ACHILL = "spec:width=480,height=854,unit=px,dpi=240"

      /** zte cygni */
      val CYGNI = "spec:width=720,height=1280,unit=px,dpi=320"

      /** zte cynthia */
      val CYNTHIA = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** zte demi */
      val DEMI = "spec:width=320,height=480,unit=px,dpi=160"

      /** zte draconis */
      val DRACONIS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** zte hera */
      val HERA = "spec:width=480,height=854,unit=px,dpi=240"

      /** zte K97 */
      val K97 = "spec:width=768,height=1024,unit=px,dpi=160"

      /** zte leo */
      val LEO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** zte lily */
      val LILY = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** zte msm8974 */
      val MSM8974 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** zte nancy */
      val NANCY = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** zte platy */
      val PLATY = "spec:width=400,height=400,unit=px,dpi=280"

      /** zte tom */
      val TOM = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** zte warp6 */
      val WARP6 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** zte Z2339 */
      val Z2339 = "spec:width=480,height=800,unit=px,dpi=220"

  }
