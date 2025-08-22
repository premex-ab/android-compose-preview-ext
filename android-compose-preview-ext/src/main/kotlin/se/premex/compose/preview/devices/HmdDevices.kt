package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * HMD device specifications for Android Compose previews.
 *
 * This extension provides HMD device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hmd.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hmd: Any
  get() = object {
      /** HMD AGTAH */
      val AGTAH = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** HMD AGTH */
      val AGTH = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** HMD ARP */
      val ARP = "spec:width=1080,height=2400,unit=px,dpi=400"

      /** HMD ARW */
      val ARW = "spec:width=1080,height=2400,unit=px,dpi=400"

      /** HMD CMT */
      val CMT = "spec:width=576,height=1280,unit=px,dpi=213"

      /** HMD LGD */
      val LGD = "spec:width=720,height=1612,unit=px,dpi=280"

      /** HMD LGP */
      val LGP = "spec:width=720,height=1612,unit=px,dpi=280"

      /** HMD LGR */
      val LGR = "spec:width=720,height=1612,unit=px,dpi=280"

      /** HMD NHK */
      val NHK = "spec:width=720,height=1612,unit=px,dpi=280"

      /** HMD NYX */
      val NYX = "spec:width=576,height=1280,unit=px,dpi=213"

      /** HMD RCK */
      val RCK = "spec:width=720,height=1612,unit=px,dpi=280"

      /** HMD SHK */
      val SHK = "spec:width=720,height=1612,unit=px,dpi=280"

      /** HMD SNT */
      val SNT = "spec:width=1080,height=2400,unit=px,dpi=400"

      /** HMD TCT */
      val TCT = "spec:width=1080,height=2400,unit=px,dpi=400"

  }
