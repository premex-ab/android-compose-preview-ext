package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BLAUPUNKT device specifications for Android Compose previews.
 *
 * This extension provides BLAUPUNKT device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BLAUPUNKT.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BLAUPUNKT: Any
  get() = object {
      /** BLAUPUNKT bangbae */
      val BANGBAE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** BLAUPUNKT Blaupunkt_SL_04 */
      val BLAUPUNKT_SL_04 = "spec:width=480,height=854,unit=px,dpi=240"

      /** BLAUPUNKT Blaupunkt_SM_01 */
      val BLAUPUNKT_SM_01 = "spec:width=480,height=800,unit=px,dpi=240"

      /** BLAUPUNKT bruno */
      val BRUNO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** BLAUPUNKT GMP */
      val GMP = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** BLAUPUNKT guandu */
      val GUANDU = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** BLAUPUNKT hanyang */
      val HANYANG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** BLAUPUNKT hongkong */
      val HONGKONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** BLAUPUNKT ICN */
      val ICN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** BLAUPUNKT ikebukuro */
      val IKEBUKURO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** BLAUPUNKT JFK */
      val JFK = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** BLAUPUNKT komagome */
      val KOMAGOME = "spec:width=720,height=1280,unit=px,dpi=213"

      /** BLAUPUNKT lavender */
      val LAVENDER = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** BLAUPUNKT longshan */
      val LONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** BLAUPUNKT martin */
      val MARTIN = "spec:width=720,height=1280,unit=px,dpi=213"

      /** BLAUPUNKT mountbaker */
      val MOUNTBAKER = "spec:width=720,height=1280,unit=px,dpi=213"

      /** BLAUPUNKT nippori */
      val NIPPORI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** BLAUPUNKT redwood */
      val REDWOOD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** BLAUPUNKT samseong */
      val SAMSEONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** BLAUPUNKT shilin */
      val SHILIN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** BLAUPUNKT SM_02_2019 */
      val SM_02_2019 = "spec:width=480,height=960,unit=px,dpi=240"

      /** BLAUPUNKT stanford */
      val STANFORD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** BLAUPUNKT tamachi */
      val TAMACHI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** BLAUPUNKT yeongdeungpo */
      val YEONGDEUNGPO = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** BLAUPUNKT zhongshan */
      val ZHONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
