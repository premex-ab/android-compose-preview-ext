package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * MITSUSHIBA device specifications for Android Compose previews.
 *
 * This extension provides MITSUSHIBA device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mitsushiba.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mitsushiba: Any
  get() = object {
      /** MITSUSHIBA TP-10-0232P3G */
      val TP_10_0232P3G = "spec:width=800,height=1280,unit=px,dpi=160"

  }
