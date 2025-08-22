package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * JUEDUR device specifications for Android Compose previews.
 *
 * This extension provides JUEDUR device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Juedur.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Juedur: Any
  get() = object {
      /** JUEDUR R500_EEA */
      val R500_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** JUEDUR R500_US */
      val R500_US = "spec:width=800,height=1280,unit=px,dpi=160"

      /** JUEDUR R700_EEA */
      val R700_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** JUEDUR R700_US */
      val R700_US = "spec:width=800,height=1280,unit=px,dpi=160"

      /** JUEDUR R800_U_EEA */
      val R800_U_EEA = "spec:width=800,height=1280,unit=px,dpi=200"

      /** JUEDUR R900_EEA */
      val R900_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** JUEDUR R900_US */
      val R900_US = "spec:width=800,height=1280,unit=px,dpi=213"

  }
