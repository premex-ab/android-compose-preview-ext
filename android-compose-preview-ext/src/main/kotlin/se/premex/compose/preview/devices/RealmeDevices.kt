package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Realme device specifications for Android Compose previews.
 *
 * This extension provides Realme device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Realme.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Realme: Any
  get() = object {
      /** Realme gangbyeon */
      val GANGBYEON = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Realme ikebukuro */
      val IKEBUKURO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Realme RMX1821 */
      val RMX1821 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Realme RMX1822 */
      val RMX1822 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Realme RMX1825 */
      val RMX1825 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Realme RMX1827 */
      val RMX1827 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Realme RMX1831 */
      val RMX1831 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** Realme RMX1833 */
      val RMX1833 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** Realme RMX1851 */
      val RMX1851 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** Realme RMX1851CN */
      val RMX1851CN = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** Realme RMX1853 */
      val RMX1853 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** Realme RMX1901CN */
      val RMX1901CN = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** Realme RMX1941 */
      val RMX1941 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Realme RMX1942 */
      val RMX1942 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Realme RMX1943 */
      val RMX1943 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Realme RMX1945 */
      val RMX1945 = "spec:width=720,height=1560,unit=px,dpi=320"

  }
