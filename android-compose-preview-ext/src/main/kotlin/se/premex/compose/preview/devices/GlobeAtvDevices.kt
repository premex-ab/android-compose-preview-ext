package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * globe_ATV device specifications for Android Compose previews.
 *
 * This extension provides globe_ATV device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.GlobeAtv.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GlobeAtv: Any
  get() = object {
      /** globe_ATV globe_ap */
      val GLOBE_AP = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** globe_ATV globe_eu */
      val GLOBE_EU = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** globe_ATV globe_na */
      val GLOBE_NA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** globe_ATV globe_sa */
      val GLOBE_SA = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
