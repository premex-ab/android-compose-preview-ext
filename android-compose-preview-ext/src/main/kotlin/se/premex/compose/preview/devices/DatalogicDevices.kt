package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Datalogic device specifications for Android Compose previews.
 *
 * This extension provides Datalogic device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Datalogic.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Datalogic: Any
  get() = object {
      /** Datalogic dl35 */
      val DL35 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Datalogic m11 */
      val M11 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Datalogic M1_HANDHELD */
      val M1_HANDHELD = "spec:width=480,height=854,unit=px,dpi=240"

      /** Datalogic nebula_pda */
      val NEBULA_PDA = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** Datalogic Q10 */
      val Q10 = "spec:width=1080,height=2160,unit=px,dpi=440"

      /** Datalogic Q10A */
      val Q10A = "spec:width=1080,height=2160,unit=px,dpi=440"

      /** Datalogic sx5 */
      val SX5 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Datalogic tomcat_pda */
      val TOMCAT_PDA = "spec:width=1080,height=2160,unit=px,dpi=480"

  }
