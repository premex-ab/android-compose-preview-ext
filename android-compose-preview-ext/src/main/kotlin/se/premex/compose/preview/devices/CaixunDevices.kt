package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Caixun device specifications for Android Compose previews.
 *
 * This extension provides Caixun device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Caixun.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Caixun: Any
  get() = object {
      /** Caixun cottongreen */
      val COTTONGREEN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Caixun marina */
      val MARINA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Caixun martin */
      val MARTIN = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Caixun nagata */
      val NAGATA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Caixun patrick */
      val PATRICK = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Caixun tamachi */
      val TAMACHI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Caixun yeongdeungpo */
      val YEONGDEUNGPO = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
